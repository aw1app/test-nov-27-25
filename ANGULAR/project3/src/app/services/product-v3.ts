import { Injectable } from '@angular/core';
import { Product } from '../models/product';
import { BehaviorSubject, Observable, of, tap } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class ProductServiceV3 {

  // shared data
  //products!:Product[]; // old way not good for auto updating UI

  private productsSubject = new BehaviorSubject<Product[]>([]);

  products$ = this.productsSubject.asObservable(); // products$ is of the type Observable<Product[]> 

  // web service providing products data
  private apiUrl = 'http://localhost:3001/products';

  constructor(private http: HttpClient) { }

  // helper method
  loadProducts(): void {
    this.http.get<Product[]>(this.apiUrl).subscribe({
      next: (data) => {
        console.log('HTTP products:', data);
        this.productsSubject.next(data); // 
      },
      error: (err) => console.error(err)
    });
  }

  getProducts(): Observable<Product[]> {
    return this.products$;
  }

  addProduct(prod: Product): void {
    console.log("INSIDE addProduct of PS v3");

    this.http.post<Product>(this.apiUrl, prod).pipe(
      tap(newProduct => {
        console.log("INSIDE addProduct of PS v3 newProduct=", newProduct);
        const currentProductList = this.productsSubject.value;
        this.productsSubject.next([...currentProductList, newProduct]);
      })
    ).subscribe();
  }


  deleteProduct(id: number): void {
    this.http.delete(`${this.apiUrl}/${id}`).subscribe({
      next: (data) => {
        const currentProductList = this.productsSubject.value;
        const updatedProductList = currentProductList.filter(p => p.id !== id);
        this.productsSubject.next(updatedProductList);
      },
      error: (err) => console.error(err)
    });
  }

}
