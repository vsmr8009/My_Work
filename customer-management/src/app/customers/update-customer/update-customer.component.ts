import { CustomerService } from './../../service/customer.service';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-customer',
  templateUrl: './update-customer.component.html',
  styleUrls: ['./update-customer.component.css']
})
export class UpdateCustomerComponent implements OnInit {
    updateForm: FormGroup;

  constructor(private customerService: CustomerService, private router: Router) { }

  ngOnInit(): void {
    this.updateForm = new FormGroup({
      id: new FormControl(null, Validators.required),
      name: new FormControl(null, Validators.required),
      address: new FormControl(null, Validators.required),
      phone: new FormControl(null, Validators.required)
    })
    const id = localStorage.getItem('id');
    if(+id > 0){
      this.customerService.getCustomerById(+id).subscribe(data =>{
        this.updateForm.patchValue(data);
      })
    }
      
  }

  onSubmit(): void {
    this.customerService.updateCustomer(this.updateForm.value).subscribe(data =>{
      this.router.navigate(['']);
    },
    error => console.log(error));

  }

}
