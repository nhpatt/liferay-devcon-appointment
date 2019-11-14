package com.liferay.appointments.internal.resource.v1_0;

import com.liferay.appointments.dto.v1_0.Appointment;
import com.liferay.appointments.resource.v1_0.AppointmentResource;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.util.TransformUtil;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;

import java.util.Collections;
import java.util.List;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.validation.constraints.NotNull;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@Path("/v1.0")
public abstract class BaseAppointmentResourceImpl
	implements AppointmentResource {

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'DELETE' 'http://localhost:8080/o/appointments/v1.0/appointments/{appointmentId}'  -u 'test@liferay.com:test'
	 */
	@Override
	@DELETE
	@Parameters(
		value = {@Parameter(in = ParameterIn.PATH, name = "appointmentId")}
	)
	@Path("/appointments/{appointmentId}")
	@Produces("application/json")
	@Tags(value = {@Tag(name = "Appointment")})
	public void deleteAppointment(
			@NotNull @Parameter(hidden = true) @PathParam("appointmentId") Long
				appointmentId)
		throws Exception {
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/appointments/v1.0/appointments/{appointmentId}'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Parameters(
		value = {@Parameter(in = ParameterIn.PATH, name = "appointmentId")}
	)
	@Path("/appointments/{appointmentId}")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Appointment")})
	public Appointment getAppointment(
			@NotNull @Parameter(hidden = true) @PathParam("appointmentId") Long
				appointmentId)
		throws Exception {

		return new Appointment();
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'PUT' 'http://localhost:8080/o/appointments/v1.0/appointments/{appointmentId}' -d $'{"date": ___, "id": ___, "title": ___}' --header 'Content-Type: application/json' -u 'test@liferay.com:test'
	 */
	@Override
	@Consumes({"application/json", "application/xml"})
	@Operation(description = "")
	@PUT
	@Parameters(
		value = {@Parameter(in = ParameterIn.PATH, name = "appointmentId")}
	)
	@Path("/appointments/{appointmentId}")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Appointment")})
	public Appointment putAppointment(
			@NotNull @Parameter(hidden = true) @PathParam("appointmentId") Long
				appointmentId,
			Appointment appointment)
		throws Exception {

		return new Appointment();
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'GET' 'http://localhost:8080/o/appointments/v1.0/sites/{siteId}/appointments'  -u 'test@liferay.com:test'
	 */
	@Override
	@GET
	@Parameters(
		value = {
			@Parameter(in = ParameterIn.PATH, name = "siteId"),
			@Parameter(in = ParameterIn.QUERY, name = "search"),
			@Parameter(in = ParameterIn.QUERY, name = "filter"),
			@Parameter(in = ParameterIn.QUERY, name = "page"),
			@Parameter(in = ParameterIn.QUERY, name = "pageSize"),
			@Parameter(in = ParameterIn.QUERY, name = "sort")
		}
	)
	@Path("/sites/{siteId}/appointments")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Appointment")})
	public Page<Appointment> getSiteAppointmentsPage(
			@NotNull @Parameter(hidden = true) @PathParam("siteId") Long siteId,
			@Parameter(hidden = true) @QueryParam("search") String search,
			@Context Filter filter, @Context Pagination pagination,
			@Context Sort[] sorts)
		throws Exception {

		return Page.of(Collections.emptyList());
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -X 'POST' 'http://localhost:8080/o/appointments/v1.0/sites/{siteId}/appointments' -d $'{"date": ___, "id": ___, "title": ___}' --header 'Content-Type: application/json' -u 'test@liferay.com:test'
	 */
	@Override
	@Consumes({"application/json", "application/xml"})
	@Operation(description = "")
	@POST
	@Parameters(value = {@Parameter(in = ParameterIn.PATH, name = "siteId")})
	@Path("/sites/{siteId}/appointments")
	@Produces({"application/json", "application/xml"})
	@Tags(value = {@Tag(name = "Appointment")})
	public Appointment postSiteAppointment(
			@NotNull @Parameter(hidden = true) @PathParam("siteId") Long siteId,
			Appointment appointment)
		throws Exception {

		return new Appointment();
	}

	public void setContextAcceptLanguage(AcceptLanguage contextAcceptLanguage) {
		this.contextAcceptLanguage = contextAcceptLanguage;
	}

	public void setContextCompany(Company contextCompany) {
		this.contextCompany = contextCompany;
	}

	public void setContextHttpServletRequest(
		HttpServletRequest contextHttpServletRequest) {

		this.contextHttpServletRequest = contextHttpServletRequest;
	}

	public void setContextHttpServletResponse(
		HttpServletResponse contextHttpServletResponse) {

		this.contextHttpServletResponse = contextHttpServletResponse;
	}

	public void setContextUriInfo(UriInfo contextUriInfo) {
		this.contextUriInfo = contextUriInfo;
	}

	public void setContextUser(User contextUser) {
		this.contextUser = contextUser;
	}

	protected void preparePatch(
		Appointment appointment, Appointment existingAppointment) {
	}

	protected <T, R> List<R> transform(
		java.util.Collection<T> collection,
		UnsafeFunction<T, R, Exception> unsafeFunction) {

		return TransformUtil.transform(collection, unsafeFunction);
	}

	protected <T, R> R[] transform(
		T[] array, UnsafeFunction<T, R, Exception> unsafeFunction,
		Class<?> clazz) {

		return TransformUtil.transform(array, unsafeFunction, clazz);
	}

	protected <T, R> R[] transformToArray(
		java.util.Collection<T> collection,
		UnsafeFunction<T, R, Exception> unsafeFunction, Class<?> clazz) {

		return TransformUtil.transformToArray(
			collection, unsafeFunction, clazz);
	}

	protected <T, R> List<R> transformToList(
		T[] array, UnsafeFunction<T, R, Exception> unsafeFunction) {

		return TransformUtil.transformToList(array, unsafeFunction);
	}

	protected AcceptLanguage contextAcceptLanguage;
	protected Company contextCompany;
	protected HttpServletRequest contextHttpServletRequest;
	protected HttpServletResponse contextHttpServletResponse;
	protected UriInfo contextUriInfo;
	protected User contextUser;

}