import { CUSTOMERS } from './../customer-mock';

import { Component} from '@angular/core';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent {
  customers= CUSTOMERS
  
  
}
