import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { ProductServiceV2 } from '../../services/product-v2';
import { Product } from '../../models/product';

@Component({
  selector: 'productlist-v2',
  imports: [CommonModule],
  standalone: true, 
  templateUrl: './productlist-v2.html',
  styleUrl: './productlist-v2.css',
})
export class ProductListComponentV2 {

  products!: Product[];
  productServiceV2!: ProductServiceV2

  constructor(productServ: ProductServiceV2) {
    this.productServiceV2 = productServ;
  }

  ngOnInit(): void {

    this.productServiceV2.getProducts().subscribe(
      {
        next: (data) => {
          console.log('Products received:', data);
          this.products = data;
        }
      }
    );
  }

  delete(id:number):void{
    this.productServiceV2.deleteProduct(id);
  }

}
