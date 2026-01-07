import { Component, Input } from '@angular/core';

@Component({
  selector: 'user',
  imports: [],
  templateUrl: './user.html',
  styleUrl: './user.css',
})
export class User {

  @Input("id") id!: number;
  @Input("name") name!: string;


}
