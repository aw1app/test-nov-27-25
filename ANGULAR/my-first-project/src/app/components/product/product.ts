import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'product',
  imports: [FormsModule],
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

  description: string = "Default description";

  //style controlling variable for style bindling
  priceColor: string = "red";
  priceFontSize: string = "20px";

  //style controlling variable for class bindling
  // using [class.classname]
  highlightY: boolean = true;
  highlightG: boolean = true;

  // class binding using [class]
  classHighlightr: string = 'highlightGreen';

  changeHightLightColor(): void {
    // toggle b/w yellow and green
    this.classHighlightr =    this.classHighlightr == 'highlightYellow'?  'highlightGreen' : 'highlightYellow';
  }

  addToCart(): void {
    alert(` Ok, added ${this.name} to the Cart!`);
  }


}
