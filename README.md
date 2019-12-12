# WIP
Appendix: top git contributors

Application uses a public github API to retrieve GIT project contributors. 
https://api.github.com/repos/gitster/git/contributors

This scala.js example demonstrates how to perform HTTP GET request, handle async response with Future, parse JSON and 
generate page using scalajs-dom library. 

`µPickle` is a very convenient, flexible & efficient json serialization library. Unfortunately, it turns out that 
the optimized javascript is significantly larger than it could be. I modified the JSON mapping code to use just the functionality 
provided by `scala.js`. It's available on branch [json-parsing-without-lib](https://github.com/Scala-js-in-minutes/git-contributors/tree/json-parsing-without-lib)  
As a result the size of optimized javascript shrinked from `380kb` to `189kb` for scala.js v0.6.31. At the time of writing 
`µPickle` didn't support scala.js v1.0.0-RC1. Updating the plugin reduced the final size of optimized javascript to `131kb`. 
  