import { Component, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-game',
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.css']
})
export class GameComponent implements OnInit {

  count = 1;
  evenCount: number;
  oddCount: number;
  Interval: any;
  constructor() { }

  ngOnInit(): void {
  }

  startGame(){
    this.Interval = setInterval(() =>{
      if(this.count % 2 == 0 ){
        this.evenCount = this.count;
      }
      else{
        this.oddCount = this.count;
      }
      this.count++;
    }, 1000);

  }
  endGame(){
    clearInterval(this.Interval);

  }

}
