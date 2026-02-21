# Lecture 6

## Form Handling

![alt text](img/image-32.png)

### Handling Form Submissions

- (For the example below) The Search() action handles GET requests and might be used for retrieving data based on a query. The Register() action handles POST requests for user registration, where sensitive data is submitted.

```
[HttpGet]
public IActionResult Search(string query){
    // handle search
}

[HttpPost]
public IActionResult Register(UserModel userModel){
    // handle register
}
```

## Model Binding

- Model binding in ASP.NET Core MVC is the process of mapping user input (from forms, query strings, etc.) to model properties in a controller.