require recipes-images/angstrom/core-image-minimal.bb

IMAGE_FEATURES += "allow-empty-password empty-root-password"

IMAGE_INSTALL += "connman mtd-utils openssh altera-gsrd-apps altera-gsrd-pio-interrupt	\
	altera-gsrd-initscripts lighttpd altera-gsrd-webcontent	\
	lighttpd-module-cgi altera-lighttpd-conf net-tools i2c-tools\
"

export IMAGE_BASENAME = "console-image-minimal"

