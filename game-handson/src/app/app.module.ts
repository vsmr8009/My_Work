import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GameComponent } from './game/game.component';
import { EvenNumberComponent } from './game/even-number/even-number.component';
import { OddNumberComponent } from './game/odd-number/odd-number.component';



@NgModule({
  declarations: [
    AppComponent,
    GameComponent,
    EvenNumberComponent,
    OddNumberComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
