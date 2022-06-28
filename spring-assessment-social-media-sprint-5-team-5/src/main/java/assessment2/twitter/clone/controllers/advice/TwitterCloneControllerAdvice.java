package assessment2.twitter.clone.controllers.advice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


import assessment2.twitter.clone.dtos.ErrorDto;
import assessment2.twitter.clone.exceptions.BadRequestException;
import assessment2.twitter.clone.exceptions.NotAuthorizedException;
import assessment2.twitter.clone.exceptions.NotFoundException;

@ControllerAdvice(basePackages = {"assessment2.twitter.clone.controllers"})

@ResponseBody
public class TwitterCloneControllerAdvice {
			@ResponseStatus(HttpStatus.BAD_REQUEST)
			@ExceptionHandler(BadRequestException.class)
			public ErrorDto handleBadRequestException(HttpServletRequest request, BadRequestException badRequestException)	{
				return new ErrorDto(badRequestException.getMessage());
			}
			
			@ResponseStatus(HttpStatus.NOT_FOUND)
		    @ExceptionHandler(NotFoundException.class)
			public ErrorDto handleNotFoundException(HttpServletRequest request, NotFoundException notFoundException)	{
				return new ErrorDto(notFoundException.getMessage());
			}
			
			@ResponseStatus(HttpStatus.UNAUTHORIZED)
			@ExceptionHandler(NotAuthorizedException.class)
			public ErrorDto handleNotAUthorizedException(HttpServletRequest request,
					NotAuthorizedException notAuthorizedException)	{
				return new ErrorDto(notAuthorizedException.getMessage());
			}
			
}
