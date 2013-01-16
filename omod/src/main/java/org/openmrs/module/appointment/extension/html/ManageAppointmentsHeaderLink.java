package org.openmrs.module.appointment.extension.html;

import org.openmrs.api.context.Context;
import org.openmrs.module.web.extension.LinkExt;

public class ManageAppointmentsHeaderLink extends LinkExt {
	
	@Override
	public String getLabel() {
		String label = Context.getMessageSourceService().getMessage("appointment.Appointment.list.manage.title");
		return label;
	}
	
	@Override
	public String getRequiredPrivilege() {
		//TODO set privilage later
		return null;
	}
	
	@Override
	public String getUrl() {
		return "module/appointment/appointmentList.list";
	}
	
}