import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SearchComponent } from './search/search.component';
import { ReportComponent } from './report/report.component';
import { EmployeeSearchService } from './employee-search.service';

@NgModule({
  declarations: [
    AppComponent,
    SearchComponent,
    ReportComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [EmployeeSearchService],
  bootstrap: [AppComponent]
})
export class AppModule { }
