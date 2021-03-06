<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN"
	"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="es">
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8" />	
		<link rel="stylesheet" href="css/master.css" type="text/css" />
		<title>Job Listing - Pro Job Seeker</title>		
	</head>
	<body>
		
		<#include "header.ftl">
		
		<div id="content">
			
			<div class="add-job">
			<a href="/jobs/create">
				Post a Job, 90 days for only 400&euro;
			</a>
		</div>
			

				<#list categories as category>
				<div class="jobs">
					<h2>
						<a href="category.html">${category}</a> Jobs
						<span>Latest post about 20 hours ago</span>
					</h2>
					<ul>
						<#list jobs as job>
							<#if job.getCategoryName() == category>
								<li>
								<#if job.isNew()>
									<span class="new">New</span>
								</#if>
								  <a href="onejob.html">
									<span class="city">${job.getLocation()}</span>
									<span class="title">${job.getTitle()}</span> in
									<span class="company">${job.getCompany()}</span>
									<span class="date">${job.getShortDate()}</span>
								  </a>
								</li>
							</#if>
						</#list>
					</ul>
				</div><!--end div class="jobs" -->
				</#list>
					</ul>
				</div><!--end div class="jobs" -->

				<div style="clear:both" ></div>
			</div> <!--end div id="content" -->
			
			<div id="footer">
				<p>&copy; 2011 Job Listing Company International</p>
			</div>
			
		</div>
	</body>
</html>