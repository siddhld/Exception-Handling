# Exception-Handling

### Exceptions interrupt the normal flow of your program and can occur due to various reasons like server issues, invalid user input, or data not found.


## Why Exception Handling Matters:

Prevent application crashes: Exceptions, if unhandled, can crash your application. Proper handling ensures smooth operation even when errors occur.
Provide informative messages: Instead of showing technical error messages to users, you can return custom error messages explaining the issue in a user-friendly way.


## Spring Boot's Approach:

Spring Boot allows for global exception handling using exception handlers.

Create an endpoint that throws an exception: This simulates an error scenario in your application code.

Create a method with the @ExceptionHandler annotation: This method will be invoked whenever the specific exception is thrown in your application.

Handle the exception and return a custom error message: Inside the @ExceptionHandler method, you can define logic to handle the exception and return a user-friendly error response.



## Checked vs. Unchecked Exceptions:

Checked Exceptions: These are exceptions that the compiler forces you to handle. They are declared with the throws keyword in a method signature. Common examples include IOException or SQLException.

Unchecked Exceptions: These are exceptions that the compiler doesn't require you to handle explicitly. They didn't require to add the throws keyword in a method signature. They typically represent programming errors or unexpected conditions. Examples include NullPointerException or IndexOutOfBoundsException.




### Extending RuntimeException (Unchecked Exceptions):

Use RuntimeException for exceptions that represent unexpected conditions or programming errors that the programmer should have anticipated and handled gracefully.
These exceptions are not required to be declared in the throws clause of a method signature. The caller doesn't need to handle them explicitly using a try-catch block, although they can choose to do so.
Common examples of unchecked exceptions include NullPointerException, IndexOutOfBoundsException, and custom exceptions extending RuntimeException that represent application-specific errors.


### Extending Exception (Checked Exceptions):

Use Exception for exceptions that signal conditions external to the normal flow of the program, such as I/O errors, network issues, or database connection problems.
These exceptions are checked by the compiler. Methods that might throw a checked exception must declare it in the throws clause of their signature. The caller must either handle the exception using a try-catch block or propagate it further by also declaring it in the throws clause of their own method.
Common examples of checked exceptions include IOException, SQLException, and FileNotFoundException.


### Choosing the Right Base Class:

- If your exception represents an unexpected condition or programming error that the developer should handle, extend RuntimeException.
- If your exception represents an external condition that can disrupt the normal program flow but might be recoverable, extend Exception.


### Benefits of Extending RuntimeException:

Simpler code: You don't need to declare the exception in the throws clause of every method that might throw it.
More flexibility: Callers can choose to handle the exception or propagate it further without compiler enforcement.
Drawbacks of Extending RuntimeException:

Potential for unexpected errors: If unchecked exceptions are not handled properly, they can cause the application to crash.
Less informative: Unchecked exceptions might not provide enough information about the underlying cause of the error.


