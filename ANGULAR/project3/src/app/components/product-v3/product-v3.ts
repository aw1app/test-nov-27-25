import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Product } from '../../models/product';
import { ActivatedRoute } from '@angular/router';
import { ProductServiceV3 } from '../../services/product-v3';

@Component({
  selector: 'product-v3',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './product-v3.html',
  styleUrl: './product-v3.css',
})
export class ProductComponentV3 {

  product$!: Observable<Product | undefined>;

  constructor(private route: ActivatedRoute, private productServ: ProductServiceV3) { }

  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));

    this.productServ.loadProducts();

    this.product$ = this.productServ.getProducts().pipe(     
      map(products => products.find(p => Number(p.id) === id))
    );

  }


}
