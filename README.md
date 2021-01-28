
## Razorops CI/CD pipeline demo of guestbook application in Clojure

This is an example code to demonstrate how to create [Clojure](https://docs.docker.com/compose/) based pipeline on [Razorops](https://docs.razorops.com/) CI/CD platform.

It's a guestbook app generated using [Luminus]() (version "3.93") web framework in Clojure. It allows users to leave a message and to view a list of messages left by others.

The code is inspired from example source code from [official tutorial](https://luminusweb.com/docs/guestbook).

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

### Running

To start a web server for the application, run:

    lein run

### Packaging the application

The application can be packaged for standalone deployment by running the following command:

        lein uberjar

### Execute tests

        export DATABASE_URL="jdbc:h2:./guestbook_test.db"
        lein test

## License

Copyright (c) 2021 Razorops LLC

Distributed under the MIT License. See the file LICENSE.md.
