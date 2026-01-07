import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Product } from '../../models/product';
import { ProductService } from '../../services/product';

@Component({
  selector: 'product',
  imports: [CommonModule],
  providers: [ProductService],
  templateUrl: './product.html',
  styleUrl: './product.css',
})
export class ProductComponent {

  product!: Product;

  productService!: ProductService

  constructor(productServ: ProductService) {
    this.productService = productServ;
  }

  ngOnInit(): void {
    this.product = this.productService.getProduct(0);
  }

}
