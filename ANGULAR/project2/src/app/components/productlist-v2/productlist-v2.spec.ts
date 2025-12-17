import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductlistV2 } from './productlist-v2';

describe('ProductlistV2', () => {
  let component: ProductlistV2;
  let fixture: ComponentFixture<ProductlistV2>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProductlistV2]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProductlistV2);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
