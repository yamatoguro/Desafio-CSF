import { NgModule } from '@angular/core';
import {
  NbActionsModule,
  NbButtonModule,
  NbCardModule,
  NbCheckboxModule,
  NbDialogModule,
  NbDialogService,
  NbFormFieldModule,
  NbIconModule,
  NbInputModule,
  NbMenuModule,
  NbMenuService,
  NbProgressBarModule,
  NbRadioModule,
  NbSearchModule,
  NbSearchService,
  NbSidebarModule,
  NbSidebarService,
  NbToastrModule,
  NbToastrService,
  NbToggleModule,
  NbTooltipModule,
  NbUserModule,
} from '@nebular/theme';

@NgModule({
  imports: [
    NbSidebarModule,
    NbCardModule,
    NbButtonModule,
    NbTooltipModule,
    NbInputModule,
    NbIconModule,
    NbMenuModule.forRoot(),
    NbTooltipModule,
    NbSearchModule,
    NbActionsModule,
    NbUserModule,
    NbToastrModule.forRoot(),
    NbDialogModule,
    NbDialogModule.forRoot(),
    NbRadioModule,
    NbToggleModule,
    NbCheckboxModule,
    NbFormFieldModule,
    NbProgressBarModule
  ],
  exports: [
    NbSidebarModule,
    NbCardModule,
    NbButtonModule,
    NbTooltipModule,
    NbInputModule,
    NbIconModule,
    NbMenuModule,
    NbTooltipModule,
    NbSearchModule,
    NbActionsModule,
    NbUserModule,
    NbToastrModule,
    NbDialogModule,
    NbRadioModule,
    NbToggleModule,
    NbCheckboxModule,
    NbFormFieldModule,
    NbProgressBarModule
  ],
  providers: [
    NbSidebarService,
    NbMenuService,
    NbSearchService,
    NbToastrService,
    NbDialogService
  ],
})
export class NebularModule {}
