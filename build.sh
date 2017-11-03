#!/bin/bash

PRJ="$(cd `dirname $0` && pwd)"

mvn clean test
