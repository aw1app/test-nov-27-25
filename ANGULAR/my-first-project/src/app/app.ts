import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ProductComponent } from './components/product/product';
import { User } from './components/user/user';
import { Product } from './models/product';
import { ProductListComponent } from './components/productlist/productlist';

@Component({
  selector: 'app-root',
  imports: [ProductComponent, User, ProductListComponent],
  templateUrl: './app.html',
  //template:'Hi {{x}} ',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = "online shopping";

  x=100;


  sampleProducts!:Product[];

  constructor(){
    this.sampleProducts=[];
    this.sampleProducts.push( new Product(1, "HP Laptop", 20000, "Gaming Laptop", true, "IMAGES/hp.png"));
    this.sampleProducts.push( new Product(2, "Samsumg Laptop", 40000, "Gaming Laptop", false, "IMAGES/samsung.png") );
  }

}
