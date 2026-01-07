import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddProductV2 } from './add-product-v2';

describe('AddProductV2', () => {
  let component: AddProductV2;
  let fixture: ComponentFixture<AddProductV2>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddProductV2]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddProductV2);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
