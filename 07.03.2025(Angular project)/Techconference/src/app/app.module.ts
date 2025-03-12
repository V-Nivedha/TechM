import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration, withEventReplay } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { AboutComponent } from './pages/about/about.component';
import { ScheduleComponent } from './pages/schedule/schedule.component';
import { SpeakersComponent } from './pages/speakers/speakers.component';
import { ContactComponent } from './pages/contact/contact.component';
import { NavigationComponent } from './pages/navigation/navigation.component';
import { AboutchildComponent } from './pages/about/aboutchild/aboutchild.component';
import { SchedulechildComponent } from './pages/schedule/schedulechild/schedulechild.component';
import { RegisterComponent } from './pages/register/register.component';
import { ScheduleFilterPipe } from './pipes/schedule-filter.pipe';
import { SpeakerschildComponent } from './pages/speakers/speakerschild/speakerschild.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    ScheduleComponent,
    SpeakersComponent,
    ContactComponent,
    NavigationComponent,
    AboutchildComponent,
    SchedulechildComponent,
    RegisterComponent,
    ScheduleFilterPipe,
    SpeakerschildComponent,
  

    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
  HttpClientModule,
  FormsModule
  ],
  providers: [
    provideClientHydration(withEventReplay())
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
