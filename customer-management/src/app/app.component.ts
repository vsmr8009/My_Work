import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'customer-management';
  count=10;

  getCount(counter): void{
    this.count=counter;
  }

  ngOnInit(): void{
    this.getFromChild(this.count);

  }
  getFromChild(event): void{
    this.count=event;
  }
  
}
