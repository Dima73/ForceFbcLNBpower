DESCRIPTION = "Force Power LNB/ToneBurst for FBC DVB-S tuners(Lunix3-4K/Galaxy 4K/GigaBlue UE & Quad 4K)
HOMEPAGE = "https://github.com/Dima73/ForceFbcLNBpower"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://README.md;md5=1271ae75e9727c17bcf6cdfdd2ad7fd8"
SRC_URI = "git://github.com/Dima73/$ForceFbcLNBpower.git;protocol=https"
S = "${WORKDIR}/git"

inherit gitpkgv distutils-openplugins

PV = "1+git${SRCPV}"
PKGV = "1+git${GITPKGV}"
