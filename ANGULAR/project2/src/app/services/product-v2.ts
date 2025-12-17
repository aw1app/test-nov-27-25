import { Injectable } from '@angular/core';
import { Product } from '../models/product';
import { BehaviorSubject, Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ProductServiceV2 {

  // shared data
  //products!:Product[]; // old way not good for auto updating UI

  private productsSubject = new BehaviorSubject<Product[]>([]);

  products$ = this.productsSubject.asObservable(); // products$ is of the type Observable<Product[]> 


  constructor() {
    let products = [];
    products.push(new Product(1, "HP Laptop", 20000, "Gaming Laptop", true, "IMAGES/hp-laptop.png", 0));
    products.push(new Product(2, "Samsumg Laptop", 40000, "Gaming Laptop", false, "IMAGES/hp.jpg", 0));
    products.push(new Product(3, "Lenova Laptop", 20500, "Gaming Laptop", true, "IMAGES/hp.jpg", 0));
    products.push(new Product(3, "Sony Laptop", 22000, "Gaming Laptop", true, "IMAGES/hp.jpg", 0));

    this.productsSubject.next(products);
  }

  getProducts(): Observable<Product[]> {
    return this.products$;
  }

  addProduct(prod: Product): void {
    console.log("INSIDE addProduct of Prod serv V2 ",prod );
    const currentProductList = this.productsSubject.value; // get current product list

    this.productsSubject.next([...currentProductList, prod]);
  }

  deleteProduct(id:number):void{
     const currentProductList = this.productsSubject.value; // get current product list
     let newProductList = currentProductList.filter( prod => prod.id !==id );

    // update the list
    this.productsSubject.next(newProductList);
  }

}
