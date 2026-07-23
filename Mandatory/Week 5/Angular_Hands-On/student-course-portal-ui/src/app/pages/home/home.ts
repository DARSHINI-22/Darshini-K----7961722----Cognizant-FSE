// Property Binding [property] : One-way binding (Component → View)
// Two-way Binding [(ngModel)] : Data flows both ways (Component ↔ View)

import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {

  // Step 11 - String Interpolation
  portalName = 'Student Course Portal';

  // Step 12 - Property Binding
  isPortalActive = true;

  // Step 13 - Event Binding
  message = '';

  // Step 14 - Two-way Binding
  searchTerm = '';

  onEnrollClick() {
    this.message = 'Enrollment opened!';
  }

}