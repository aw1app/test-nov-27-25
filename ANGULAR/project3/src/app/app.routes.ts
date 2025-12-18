import { Routes } from '@angular/router';
import { ProductListComponentV3 } from './components/productlist-v3/productlist-v3';
import { AddProductComponentV3 } from './components/add-product-v3/add-product-v3';
import { ProductComponentV3 } from './components/product-v3/product-v3';

export const routes: Routes = [
    { path: '', component: ProductListComponentV3 },
    { path: 'add', component: AddProductComponentV3 },
     { path: 'product/:id', component: ProductComponentV3 },
    { path: '**', redirectTo: '' }
];
