import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ProductListComponent } from './components/productlist/productlist';
import { ProductComponent } from './components/product/product';
import { AddProductComponent } from './components/add-product/add-product';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, ProductListComponent, ProductComponent, AddProductComponent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
}
