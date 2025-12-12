import { Component, Input } from '@angular/core';
import { Product } from '../../models/product';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'product-list',
  imports: [CommonModule],
  templateUrl: './productlist.html',
  styleUrl: './productlist.css',
})
export class ProductListComponent {

  @Input("products") products!:Product[];



}
