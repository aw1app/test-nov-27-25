import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Product } from './components/product/product';
import { User } from './components/user/user';

@Component({
  selector: 'app-root',
  imports: [Product, User],
  templateUrl: './app.html',
  //template:'Hi {{x}} ',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = "online shopping";

  x=100;
}
