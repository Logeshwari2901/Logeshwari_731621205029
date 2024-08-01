import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'MyProject';
  name:string;
     age:number;
     email: string;
     imagePath:string;
   
     constructor(){
       this.name="Loks";
       this.age=20;
       this.email="Logeshwarisundaram04@gamil.com";
       this.imagePath="./assets/logo.png";
    }

     changeName(){
       this.name="LOGESHWARI";
     }
    changeAge(){
      this.age=21;
     }

     changeEmail(){
       this.email="d2004@gmail.com"
     }
     changeImage(){
       this.imagePath="./assets/logo2.png"
    }
 }

