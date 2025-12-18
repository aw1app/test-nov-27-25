import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductlistV3 } from './productlist-v3';

describe('ProductlistV3', () => {
  let component: ProductlistV3;
  let fixture: ComponentFixture<ProductlistV3>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProductlistV3]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProductlistV3);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
