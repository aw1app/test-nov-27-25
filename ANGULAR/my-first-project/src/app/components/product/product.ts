import { Component, Input } from '@angular/core';

@Component({
  selector: 'product',
  imports: [],
  templateUrl: './product.html',
  styleUrl: './product.css',
})
export class ProductComponent {

  // id! : number;
  // name!: string;
  // price!:number;

  // Inputs from the parent component
  @Input("id") id!: number;
  @Input("name") name!: string;
  @Input("price") price!: number;

  description:string = "Default description";


}
