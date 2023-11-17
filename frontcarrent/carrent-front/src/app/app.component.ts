import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { HttpClientModule } from "@angular/common/http";
import { FormsModule } from '@angular/forms';

import { HeaderComponent } from "./header/header.component";
import { HomeComponent } from "./home/home.component";
import { PaineladminComponent } from "./paineladmin/paineladmin.component";
import { PainelusuarioComponent } from "./painelusuario/painelusuario.component";
import { FooterComponent } from "./footer/footer.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css'],
    imports: [
        CommonModule,
        RouterOutlet,
        HttpClientModule,
        FormsModule,
        HeaderComponent,
        HomeComponent,
        PainelusuarioComponent,
        PaineladminComponent,
        FooterComponent
    ]
})
export class AppComponent {
  title = 'carrent';
}