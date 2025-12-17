import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ProductListComponent } from './components/productlist/productlist';
import { ProductComponent } from './components/product/product';
import { AddProductComponent } from './components/add-product/add-product';
import { ProductListComponentV2 } from './components/productlist-v2/productlist-v2';
import { AddProductComponentV2 } from './components/add-product-v2/add-product-v2';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, ProductListComponent, ProductComponent, AddProductComponent, ProductListComponentV2,AddProductComponentV2 ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
}
