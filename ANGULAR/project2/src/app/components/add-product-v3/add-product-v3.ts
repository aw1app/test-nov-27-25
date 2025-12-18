import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { Product } from '../../models/product';
import { ProductServiceV3 } from '../../services/product-v3';

@Component({
  selector: 'add-product-v3',
  standalone:true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './add-product-v3.html',
  styleUrl: './add-product-v3.css',
})
export class AddProductComponentV3 {

  productServiceV3!: ProductServiceV3;
  productForm!: FormGroup;


  constructor(private fb: FormBuilder, productServ: ProductServiceV3) {
    this.productServiceV3 = productServ;

    // Form control creation and initialization
    this.productForm = this.fb.group(

      {
        productName: ['', [Validators.required, Validators.minLength(3)]],
        productPrice: ['', [Validators.required, Validators.pattern(/^\d+(\.\d{1,2})?$/), Validators.max(100000)]],
        inStock: [true]
      }

    );

  }

  
  getRandomInt(min: number, max: number) {
    const minCeiled = Math.ceil(min);
    const maxFloored = Math.floor(max);
    return Math.floor(Math.random() * (maxFloored - minCeiled) + minCeiled); // The maximum is exclusive and the minimum is inclusive
  }

  // Call the Product Service and add the product from the new product form.
  addProduct(): void {
    console.log("INSIDE addProduct function");
    if (this.productForm.valid) {
       console.log("INSIDE addProduct of Add prod comp  v3 pos-1" );
      let name = this.productForm.get('productName')?.value;
      let price = this.productForm.get('productPrice')?.value;
      let inStock = this.productForm.get('inStock')?.value;

      let id = this.getRandomInt(1000, 10000);

      let tempProduct = new Product(id, name, price, '', inStock, '', 100);
      console.log("INSIDE addProduct of Add prod comp  v3 pos-1 tempProduct=", tempProduct );
      //Call the Product Service 
      this.productServiceV3.addProduct(tempProduct);
    }
  }

}
