#!/bin/bash

keytool -import -alias my -keystore store/truststore.jks -file store/cert.crt
