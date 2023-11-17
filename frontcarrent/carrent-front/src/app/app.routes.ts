import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { PaineladminComponent } from './paineladmin/paineladmin.component';
import { PainelusuarioComponent } from './painelusuario/painelusuario.component';

export const routes: Routes = [
    {path: 'home', component: HomeComponent},
    {path: 'paineladmin', component: PaineladminComponent},
    {path: 'painelusuario', component: PainelusuarioComponent}
];
