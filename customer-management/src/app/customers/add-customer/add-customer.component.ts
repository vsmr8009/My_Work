import { CustomerService } from './../../service/customer.service';
import { Customer } from './../../model/customer';
import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { ControlContainer, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {
  @Input() countFromParent: number;
  customer: Customer
  @Output() countFromChild= new EventEmitter<number>();
  signupForm: FormGroup;
  constructor(private customerService: CustomerService, private router: Router) { }

  ngOnInit(): void {
    this.signupForm = new FormGroup({
      id: new FormControl(null, Validators.required),
      name: new FormControl(null, Validators.required),
      address: new FormControl(null, Validators.required),
      phone: new FormControl(null, Validators.required)

    });
  }

  onSubmit(): void{
   // this.countFromChild.emit(this.countFromParent + 5)
    this.customerService.createCustomer(this.signupForm.value).subscribe(data =>{
      console.log("Customer added Successfully..!");
      this.router.navigate(['']);
    })
    console.log(this.signupForm)
  }

}
