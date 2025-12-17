import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Product } from '../../models/product';
import { ProductService } from '../../services/product';

@Component({
  selector: 'productlist',
  imports: [CommonModule],
  providers: [ProductService],
  templateUrl: './productlist.html',
  styleUrl: './productlist.css',
})
export class ProductListComponent {

  products!: Product[];
  productService!:ProductService

  constructor(productServ:ProductService) {
    this.productService = productServ;
  }

  ngOnInit():void {
    this.products = this.productService.getProducts();
  }
}
