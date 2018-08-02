double arithmetic(double a, double b, char* operator) {
  // Your Code here!
  if ( strcmp("multiply", operator) == 0 ) 
  {
      return a*b; 
  }
  else if ( strcmp("subtract", operator) == 0) 
  {
     return a-b; 
  }
  else if ( strcmp("add", operator) == 0) 
  {
    return a+b; 
  }
  else if ( strcmp("divide", operator) == 0) 
  {
    return a/b; 
  }
  
}
