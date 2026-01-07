import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Product } from '../../models/product';
import { ProductServiceV3 } from '../../services/product-v3';
import { Observable } from 'rxjs';

@Component({
  selector: 'productlist-v3',
  imports: [CommonModule],
  standalone: true, 
  templateUrl: './productlist-v3.html',
  styleUrl: './productlist-v3.css',
})
export class ProductListComponentV3 implements OnInit{

  //products: Product[] =[];
  productServ!: ProductServiceV3

  products$!: Observable<Product[]>;

  constructor( productServ: ProductServiceV3) {
    this.productServ=productServ;    
   }

  ngOnInit(): void {
    this.productServ.loadProducts();

    this.products$ = this.productServ.getProducts();
  };

  

  delete(id:number):void{
   this.productServ.deleteProduct(id);
  }

}
