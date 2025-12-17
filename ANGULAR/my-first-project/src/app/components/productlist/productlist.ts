import { Component, Input } from '@angular/core';
import { Product } from '../../models/product';
import { CommonModule, NgSwitch, NgSwitchCase, NgSwitchDefault } from '@angular/common';

@Component({
  selector: 'product-list',
  imports: [CommonModule, NgSwitch, NgSwitchCase, NgSwitchDefault],
  templateUrl: './productlist.html',
  styleUrl: './productlist.css',
})
export class ProductListComponent {

  @Input("products") products!:Product[];



}
