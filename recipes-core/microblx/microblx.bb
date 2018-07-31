SUMMARY = "Real-time, embedded, reflective function blocks"
DEPENDS = "luajit luajit-native liblfds uthash"
RDEPENDS_${PN} = "luajit liblfds uutils"

LICENSE = "eCos-exception-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=40663994a34d497bf17c10d49c3aaeaf"
HOMEPAGE = "https://github.com/kmarkus/microblx"

PR = "r0"
PV = "0.3.3"
TAG = "v${PV}"
BRANCH = "master"
SRC_URI = "git://github.com/kmarkus/microblx.git;branch=${BRANCH};tag=${TAG}"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

# libs, headers and lua modules
FILES_${PN} += " \
	${libdir}/libubx.so.* \
	${includedir}/*.h \
	${datadir}/lua/* \
	"

# blocks
FILES_${PN} += "${libdir}/microblx/*"

# docs
FILES_${PN}-doc += " \
	${datadir}/microblx/* \
	"

# dev files
FILES_${PN}-dev = " \
	${libdir}/libubx.so \
	${libdir}/*.la \
	${libdir}/pkgconfig/ubx0.pc \
	"
