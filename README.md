# bracer-eval

Demonstrates a bug in [brace-expansion-java](https://github.com/AndersDJohnson/brace-expansion-java).

Expression `foo-{10..12}` should lead to
> foo-10
> foo-11
> foo-12

Instead it returns this
> foo-10
> foo-11
> foo-12
> foo-13
> foo-14
> foo-15
> foo-16
> foo-17
> foo-18
> foo-19
> foo-110
> foo-111
> foo-112

Reproduce the problem by running `./build.sh`, or directly via Maven: `mvn clean test`
