import { Component, Input } from '@angular/core';
import { Product } from '../../models/product';
import { CommonModule } from '@angular/common';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'product-list',
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './productlist.html',
  styleUrl: './productlist.css',
})
export class ProductListComponent {

  @Input("products") products!: Product[];

  constructor(private fb: FormBuilder) {

    this.productForm = this.fb.group(

      {
        productName: ['', [Validators.required, Validators.minLength(3)]],
        productPrice: ['', [Validators.required, Validators.pattern(/^\d+(\.\d{1,2})?$/), Validators.max(100000)]],
        inStock: [true]
      }

    );

  }


  // Add Product
  productForm!: FormGroup;

  getRandomInt(min: number, max: number) {
    const minCeiled = Math.ceil(min);
    const maxFloored = Math.floor(max);
    return Math.floor(Math.random() * (maxFloored - minCeiled) + minCeiled); // The maximum is exclusive and the minimum is inclusive
  }

  addProduct(): void {
    console.log("INSIDE addProduct function");
    if (this.productForm.valid) {
      let name = this.productForm.get('productName')?.value;
      let price = this.productForm.get('productPrice')?.value;
      let inStock = this.productForm.get('inStock')?.value;

      let id = this.getRandomInt(1000, 10000);

      let tempProduct = new Product(id, name, price, '', inStock, '', 100);
      this.products.push(tempProduct);
    }
  }


}
