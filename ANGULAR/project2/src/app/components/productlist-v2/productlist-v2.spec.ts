import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductListComponentV2 } from './productlist-v2';

describe('ProductlistV2', () => {
  let component: ProductListComponentV2;
  let fixture: ComponentFixture<ProductListComponentV2>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProductListComponentV2]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProductListComponentV2);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
