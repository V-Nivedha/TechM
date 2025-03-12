import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { AboutComponent } from './pages/about/about.component';
import { ScheduleComponent } from './pages/schedule/schedule.component';
import { RegisterComponent } from './pages/register/register.component';
import { SpeakersComponent } from './pages/speakers/speakers.component';
const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
   { path: 'schedule', component: ScheduleComponent },
   {path: 'register', component : RegisterComponent},
   { path: 'speakers',component:SpeakersComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
