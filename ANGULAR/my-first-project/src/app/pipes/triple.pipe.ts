import { Pipe, PipeTransform } from '@angular/core';


@Pipe({
    name: 'triple',
    standalone: true
})
export class TriplePipe implements PipeTransform {
    
    transform(value: number): number {
       return  value * 3;
    }

}

