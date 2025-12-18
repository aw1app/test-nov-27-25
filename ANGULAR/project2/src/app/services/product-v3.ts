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
  private apiUrl = 'http://localhost:3000/products';

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
    this.http.post<Product>(this.apiUrl, prod).pipe(
      tap(newProduct => {
        const currentProductList = this.productsSubject.value;
        this.productsSubject.next([...currentProductList, newProduct]);
      })
    );
  }


  // deleteProduct(id: number): void {
  //   const currentProductList = this.productsSubject.value; // get current product list
  //   let newProductList = currentProductList.filter(prod => prod.id !== id);

  //   // update the list
  //   this.productsSubject.next(newProductList);
  // }

}
