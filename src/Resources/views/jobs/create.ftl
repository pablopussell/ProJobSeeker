<#import "layout.ftl" as layout />

<@layout.master title="Job Listing">
				<form id="add-job-form" action="/jobs/create" method="POST">
					<h2>Create a job listing</h2>
					<fieldset>
						<legend>Job Description</legend>
						<input type="text" name="title" />
					</fieldset>
					<fieldset>
						<legend>Category</legend>
						<ul>
							<li>
								<input checked="checked" id="category_1" name="category" type="radio" value="1" />
								<label for="category_1">Design</label>
							</li>
							<li>
								<input id="category_2" name="category" type="radio" value="2" />
								<label for="category_2">Programming</label>
							</li>
							<li>
								<input id="category_3" name="category" type="radio" value="3" />
								<label for="category_3">Executive</label>
							</li>
							<li>
								<input id="category_4" name="category" type="radio" value="4" />
								<label for="category_4">Other</label>
							</li>
						</ul>
					</fieldset>
					<fieldset>
						<legend>Place</legend>
						<input type="text" name="place" />
					</fieldset>
					<fieldset>
						<legend>Description</legend>
						<textarea name="description" rows="10" cols="80"></textarea>
					</fieldset>
					<fieldset>
						<legend>Company</legend>
						<input type="text" name="company" />
					</fieldset>
					<fieldset>
						<input type="submit" value="Post an ad for 90 days" name="commit" class="button"> or <a href="index.html">Return to listing</a>
					</fieldset>
				</form>
</@layout.master>